package com.mn.topto.webapp.controllers;

import com.mn.topto.models.entity.Anounsment;
import com.mn.topto.service.abstracts.model.AnounsmentService;
import com.mn.topto.service.abstracts.model.CategoryService;
import com.mn.topto.service.abstracts.model.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/api/anouns")
public class AnounsResourceController {

    @Value("${upload.path}")
    private String uploadPath;

    private final AnounsmentService anounsmentService;
    private final CategoryService categoryService;
    private final UserService userService;

    public AnounsResourceController(AnounsmentService anounsmentService,
                                    CategoryService categoryService,
                                    UserService userService) {
        this.anounsmentService = anounsmentService;
        this.categoryService = categoryService;
        this.userService = userService;
    }

    @Bean({"b1"})
    public List<String> myBean(){
        System.out.println("dssdf");
        return null;
    }

    @PostMapping
    public void addAnouns(@RequestParam String category,
                          @RequestParam String title,
                          @RequestParam String description,
                          @RequestParam Long userId) {
        Anounsment anounsment = new Anounsment().builder()
                .categoryId(categoryService.getByKey(Long.parseLong(category)))
                .description(description)
                .title(title)
                .userId(userService.getByKey(userId))
                .persistDateTime(LocalDateTime.now())
                .is_update_today(false)
                .price(1000)
                .isSolt(false)
                .updateDate(null)
                .view(0)
                .premium(null)
                .vip(null)
                .view_today(0)
                .build();
//        if(file != null){
//            File uploadDir = new File(uploadPath);
//            if(!uploadDir.exists()){
//                uploadDir.mkdir();
//            }
//            String uuidFile = UUID.randomUUID().toString();
//            String resultFilename = uuidFile + "." + file.getOriginalFilename();
//            file.transferTo(new File(resultFilename));
//        }
        anounsmentService.persist(anounsment);
    }
}
