public class RplaceSpace {
//    是非常简单的方法，没有什么困难，算一下空格数，新建列表，加进去，最后输出
//     Time = O (n) Space: O(n)
//     !!! 新学习了inplace 替换，
//    char[] new_str = str;
//    str = new char[new_length]; 这一步非常巧妙，直接替换，并不会在heap上面新建内容， 将空间复杂度降到O（1）








    // Maximum length of string
    // after modifications.


    // Replaces spaces with %20 in-place
    // and returns new length of modified string.
    // It returns -1 if modified string
    // cannot be stored in str[]
    static char[] replaceSpaces(char[] str) {
        if (str.length == 0 || str == null) {
            return str;
        }
        int i;
        int space = 0;
        for (i = 0; i <= str.length - 1; i++) {
            if (str[i] == ' ') {
                space++;
            }
        }

        int NL = i + 1 + space * 2;
        int index = NL - 1;
        char[] newstr = new char[NL];
        for (int j = i - 1; j >= 0; j--) {
            if (str[j] == ' ') {
                newstr[index] = '0';
                newstr[index - 1] = '2';
                newstr[index - 2] = '%';
                index = index - 3;
            } else {
            newstr[index] = str[j];
            index--;}
        }
        return newstr;
    }
    // Driver Code
    public static void main(String[] args)
    {
        char[] str = "Mr John  Smith ".toCharArray();

        // Prints the replaced string
        str = replaceSpaces(str);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }

}
