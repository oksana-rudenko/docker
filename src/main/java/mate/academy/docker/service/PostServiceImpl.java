package mate.academy.docker.service;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import mate.academy.docker.dto.CreatePostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.mapper.PostMapper;
import mate.academy.docker.repository.PostRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public PostResponseDto save(CreatePostRequestDto createPostRequestDto) {
        return postMapper.toDto(postRepository.save(postMapper.toEntity(createPostRequestDto)));
    }

    @Override
    public List<PostResponseDto> getAll(Pageable pageable) {
        return postRepository.findAll(pageable).stream()
                .map(postMapper::toDto)
                .toList();
    }
}
