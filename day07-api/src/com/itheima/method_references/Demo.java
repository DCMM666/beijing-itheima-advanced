package com.itheima.method_references;

public class Demo {
    public static void main(String[] args) {
        //静态方法引用格式   类名::方法名
        InterB interB = Math::max;
        //构造方法引用格式   类名::new
        InterA interA = Student::new;
        InterA interA1 = Test::getStudent;
        //实体方法引用格式   对象名::方法名
        InterC interC = System.out::println;
    }
}
class Test{
    public static  Student getStudent(){
        return new Student();
    }
}

@FunctionalInterface
interface InterA{
    public abstract Student getStudent();
}

@FunctionalInterface
interface InterB{
    public abstract int getMax(int a , int b);
}
@FunctionalInterface
interface InterC{
    public abstract void print(String str);
}