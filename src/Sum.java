public class Sum {
    /*
    Method overloading in Java occurs when two or more methods in the same class have the same name but different parameters (i.e., different number of parameters, different types of parameters, or both). It is a way to achieve polymorphism in Java. The key points about method overloading are:

Methods have the same name but different parameter lists.
It occurs within the same class.
It does not consider return types or access modifiers.
     */

    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }


}
