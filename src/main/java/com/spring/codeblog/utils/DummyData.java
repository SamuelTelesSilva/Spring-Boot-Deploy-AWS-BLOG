package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

   // @PostConstruct
    public void savePosts (){

        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Samuel");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("aslkdnadnakdnkadbkabdkjbak askdnaknbdkabkdb kjabskbd kabksjd bkasjb dkbak bak sbdkabdbak");

        Post post2 = new Post();
        post2.setAutor("Susu");
        post2.setData(LocalDate.now());
        post2.setTitulo("Samuel Lindão");
        post2.setTexto("aslkdnadnakdnkadbkabdkjbak askdnaknbdkabkdb kjabskbd kabksjd bkasjb dkbak bak sbdkabdbak");

        postList.add(post1);
        postList.add(post2);

        //Salvando post por post usando o metodo Save da classe repository
        for (Post post : postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.print(postSaved.getId());
        }


    }

}
