package com.mn.topto.service.impl;

import com.mn.topto.models.entity.*;
import com.mn.topto.models.util.Enum1;
import com.mn.topto.service.abstracts.model.AnounsmentService;
import com.mn.topto.service.abstracts.model.CategoryService;
import com.mn.topto.service.abstracts.model.TestService;
import com.mn.topto.service.abstracts.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class TestDataEntity {

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AnounsmentService anounsmentService;

    @Autowired
    private TestService testService;


    public void createEntity() {
        createUserEntity();
        createCategoryEntity();
        createAnounsEntity();
        createTest();
    }

    private void createTest() {
        A a = new A();
        B b = new B();
        B b1 = new B();
        B b2 = new B();
        List<B> bList= new ArrayList<>();
        bList.add(b);
        bList.add(b1);
        bList.add(b2);

        a.setB(bList);
        b.setA(a);
        b1.setA(a);
        b2.setA(a);

        testService.persist(a);
//        testService.persist(b);
        B b3 = a.getB().get(0);
        a.getB().remove(b3);
//        testService.update(a);
//        testService.delete(a);
//        try {
//            Thread.sleep(1000*20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }




//        Map<String, Integer> str = new HashMap<>();
//        str.put("First", 1);
//        str.put("Second", 2);
//        A a = new A("Hello", "1");
//        Embedded embedded = Embedded.builder()
//                .name("Embd").build();
//        Embd1 embd1 = new Embd1("NameOfEmbd1", "embd1");
////        embd1.setNumbers(str);
////        embd1.setA(a);
//
//        Embd2 embd2 = new Embd2("embd2");
//        embd2.setEnum1(Enum1.LOW);
//        testService.persist(embedded);
//        testService.persist(embd2);
//        testService.persist(embd1);
//        Embedded embedded1 = testService.getByKey(1l);

//        try {
//            Thread.sleep(1000*20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//
//        System.out.println("-----------------------------------------------------------------");
//
//        System.out.println("-----------------------------------------------------------------");
//        testService.persist(embd1);
//        Embd2 embd21 = new Embd2("embd2_1");
//        embd2.setEnum1(Enum1.MEDIUM);
//        Embd2 embd22 = new Embd2("embd2_2");
//        embd2.setEnum1(Enum1.HIGH);
//        System.out.println("-----------------------------------------------------------------");
//        testService.persist(embd21);
//        System.out.println("-----------------------------------------------------------------");
//        testService.persist(embd22);
//        System.out.println("//");
//        System.out.println("//");
//        try {
//            Thread.sleep(1000*60);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        embd22.setEmbd2("new_value");
//        embd21.setEmbd2("new_value21");
//        testService.update(embd21);
//        System.out.println(testService.getAll());
    }

    private void createUserEntity() {
        User user = User.builder()
                .email("user@mal.ru")
                .isEnabled(true)
                .links("user@gmail.com")
                .password("1234")
                .persistDateTime(LocalDateTime.now())
                .name("user1")
                .role("USER_ROLE")
                .telefon("+996777662244")
                .build();
        userService.persist(user);
    }

    private void createCategoryEntity() {
        Category category = Category.builder()
                .category("Auto")
                .parentsId(0l)
                .build();
        categoryService.persist(category);

        Category category1 = Category.builder()
                .category("Auto1")
                .parentsId(0l)
                .build();
        categoryService.persist(category1);

        Category category2 = Category.builder()
                .category("Auto2")
                .parentsId(0l)
                .build();
        categoryService.persist(category2);

        Category category3 = Category.builder()
                .category("Auto3")
                .parentsId(0l)
                .build();
        categoryService.persist(category3);

        Category category4 = Category.builder()
                .category("Mers")
                .parentsId(1l)
                .build();
        categoryService.persist(category4);

        Category category5 = Category.builder()
                .category("Mers1")
                .parentsId(1l)
                .build();
        categoryService.persist(category5);

        Category category6 = Category.builder()
                .category("Mers2")
                .parentsId(2l)
                .build();
        categoryService.persist(category6);

        Category category7 = Category.builder()
                .category("Mers3")
                .parentsId(2l)
                .build();
        categoryService.persist(category7);

        Category category8 = Category.builder()
                .category("Mers4")
                .parentsId(3l)
                .build();
        categoryService.persist(category8);

        Category category9 = Category.builder()
                .category("Mers5")
                .parentsId(4l)
                .build();
        categoryService.persist(category9);
    }

    private void createAnounsEntity() {
        Anounsment anounsment = Anounsment.builder()
                .title("Mercedes W124")
                .description("Description Merc W124")
                .persistDateTime(LocalDateTime.now())
                .price(3000)
                .categoryId(categoryService.getByKey(1l))
                .userId(userService.getByKey(1l))
                .build();
        anounsmentService.persist(anounsment);
    }

}
