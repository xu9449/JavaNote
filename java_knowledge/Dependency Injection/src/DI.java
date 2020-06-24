/*
DependencyInjection Note:

DI ways:
constructor based injection:

setter based: only different is the 顺序

filed based injection:
cons: easy to find the dependency
pros: break all the encapsulation things

Dependency Injection advantage:
i. code loose couple
ii. easily testable
iii. moure reusable as the implementation is in the java configuration files

Disadvantage:
i. 拆的太碎， increases complexity, usually by increasing the number of classes
ii. Your code will coupled to the dependency injection framework you use
if you change to another framework, you will be really hard
iii. DI containers or approaches that perform type resolving generally incur a slight runtime penalty

Prototype:
在原来的基础上进行修改，比如getClaringClass()
 */

public class DI {
    public static void main(String[] args) {

    }

}
