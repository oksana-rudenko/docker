package mate.academy.docker.service;

import mate.academy.docker.dto.CreatePostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {

    PostResponseDto save(CreatePostRequestDto createPostRequestDto);

    List<PostResponseDto> getAll(Pageable pageable);
}
