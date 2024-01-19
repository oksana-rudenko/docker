package mate.academy.docker.controller;

import lombok.RequiredArgsConstructor;
import mate.academy.docker.dto.CreatePostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostResponseDto save(@RequestBody CreatePostRequestDto createPostRequestDto) {
        return postService.save(createPostRequestDto);
    }

    @GetMapping
    public List<PostResponseDto> getAll(Pageable pageable) {
        return postService.getAll(pageable);
    }
}
