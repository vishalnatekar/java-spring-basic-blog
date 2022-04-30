package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap){
        List<Post> allPosts = postRepository.getAllPosts();
        modelMap.put("posts",allPosts);
        return "home";
    }
private PostRepository postRepository;

    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }





}
