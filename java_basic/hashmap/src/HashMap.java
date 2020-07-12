import com.sun.istack.internal.Nullable;
import com.sun.tools.javac.util.GraphUtils;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

////根据key获取hashMap中的值
//public V get(K k);
//
////获得Map中元素的个数
//public int size();
//
////获取Map中，键值对的对象
//interface Entry<K,V>{
//    K getKey();
//
//    V getValue();
//
//    V setValue(V v);
//
//}
//}
//
//
//        package com.jian.utils;
/**
 * hashMap的实现 数组+链表
 *
 * @author weijianyi
 *
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> implements Map<K, V> {
    // 数据存储的结构==>数组+链表
    Node<K, V>[] array = null;

    // 数组/哈希桶的长度,就是数组初始化的长度
    private static int defaultLength = 16;

    /**加载因子/扩容因子,就是给数组界定一个存储阈值,
     当数组沾满整个数组的75%的时候,触发扩容操作)**/
    private static double factor = 0.75D;

    // hashMap中的元素个数
    private int size;

    // put元素方法
    @SuppressWarnings("unchecked")
    @Override
    public V put(K k, V v) {

        // 1.载机制，使用的时候进行分配
        if (array == null) {
            //初始化一个数组,给的长度是defaultLength
            array = new Node[defaultLength];
        }

        // 2.通过hash算法，计算出具体插入的位置,也就是数组的下标
        int index = position(k, defaultLength);

        // 扩容,判断是否需要扩容
        // 扩容规则,元素的个数size 大于 桶的尺寸*加载因子
        if (size > defaultLength * factor) {
            resize();
        }

        // 3.放入要插入的元素(添加到链表)
        Node<K, V> node = array[index];
        //先判断一下这个链表的index位置是否为空
        if (node == null) {
            //链表的index这个位置是空的,直接新建该链表并将值放入该位置
            array[index] = new Node<K, V>(k, v, null);
            //元素的个数加自增1
            size++;
        } else {
            if (k.equals(node.getKey()) || k == node.getKey()) {
                return node.setValue(v);
            } else {
                array[index] = new Node<K, V>(k, v, node);
                size++;
            }
        }

        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    // 扩容,并且重新排列元素
    private void resize() {
        // 翻倍扩容
        // 1.创建新的array临时变量,相当于defaultlength*2
        @SuppressWarnings("unchecked")
        Node<K, V>[] temp = new Node[defaultLength << 1];

        // 2.重新计算散列值，插入到新的array中去。 code=key % defaultLength ==> code=key %
        // defaultLength*2
        Node<K, V> node = null;
        for (int i = 0; i < array.length; i++) {
            node = array[i];
            while (node != null) {
                // 重新散列
                int index = position(node.getKey(), temp.length);
                // 插入链表的头部
                Node<K, V> next = node.next;
                // 3
                node.next = temp[index];
                // 1
                temp[index] = node;
                // 2
                node = next;

            }
        }

        // 3.替换掉旧的array
        array = temp;
        //更新默认的扩容因子的值
        defaultLength = temp.length;
        temp = null;

    }

    // 计算位置
    private int position(K k, int length) {
        int code = k.hashCode();

        // 取模算法
        return code % (length - 1);

        // 求与算法
        // return code & (defaultLength-1);
    }
    /**
     * 用K获取hashMap 的K对应的值
     */
//    @Override
//    public V get(K k) {
//        if (array != null) {
//            int index = position(k, defaultLength);
//            Node<K, V> node = array[index];
//            // 遍历链表
//            while (node != null) {
//                // 如果key值相同返回value
//                if (node.getKey() == k) {
//                    return node.getValue();
//                } else {
//                    // 如果key值不同则调到下一个元素
//                    node = node.next;
//                }
//            }
//        }
//
//        return null;
//    }
    /**
     * 获取hashMap元素个数
     */
    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    // 链表节点(链表类)
    static class Node<K, V> implements Entry<K, V> {
        K key;
        V value;
        //表示下一个节点
        Node<K, V> next;

        // 构造一个包含当前节点和下一个节点的链表
        public Node(K key, V value, Node<K, V> next) {
            super();
            this.key = key;
            this.value = value;
            this.next = next;
        }
        /**
         * 链表的get和set方法
         */
        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V v) {
            V oldValue = this.value;
            this.value = v;
            return oldValue;
        }

    }

    // 测试方法
    public void print() {
        System.out.println("===============================");
        if (array != null) {
            Node<K, V> node = null;
            for (int i = 0; i < array.length; i++) {
                node = array[i];
                System.out.print("下标[" + i + "]");
                // 遍历链表
                while (node != null) {
                    System.out.print("[" + node.getKey() + ":" + node.getValue() + "]");
                    if (node.next != null) {
                        node = node.next;
                    } else {
                        // 到尾部元素
                        node = null;
                    }
                }
                System.out.println();
            }

        }
    }
}

