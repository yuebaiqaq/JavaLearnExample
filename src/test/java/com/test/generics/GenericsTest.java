package com.test.generics;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class GenericsTest {

    @Test
    public void GenericsTest(){
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");
        System.out.println("泛型测试key is " + genericInteger.getKey());
        System.out.println("泛型测试key is " + genericString.getKey());
    }

    public void showKeyValue(Generic<?> obj){
        System.out.println("泛型测试key value is " + obj.getKey());
    }

    @org.junit.jupiter.api.Test
    public void GenericsInterfaceTest(){
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        showKeyValue(gNumber);
        showKeyValue(gInteger);

// showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer>
// cannot be applied to Generic<java.lang.Number>
// showKeyValue(gInteger);
    }

    @Test
    public void FruitGeneratorTest()
    {
        FruitGenerator<String> fruitGenerator = new FruitGenerator<String>();
        System.out.println(fruitGenerator.next());
    }
}
