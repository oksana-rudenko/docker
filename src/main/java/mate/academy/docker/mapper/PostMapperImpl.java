package mate.academy.docker.mapper;

import mate.academy.docker.dto.CreatePostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.model.Post;
import org.springframework.stereotype.Component;

//@Component
public class PostMapperImpl implements PostMapper {
    @Override
    public Post toEntity(CreatePostRequestDto createPostRequestDto) {
        if (createPostRequestDto == null) {
            return null;
        }

        Post post = new Post();
        if (createPostRequestDto.title() != null) {
            post.setTitle(createPostRequestDto.title());
        }
        if (createPostRequestDto.body() != null) {
            post.setBody(createPostRequestDto.body());
        }
        return post;
    }

    @Override
    public PostResponseDto toDto(Post post) {
        if (post == null) {
            return null;
        }
        Long id = null;
        String title = null;
        String body = null;

        if (post.getId() != null) {
            id = post.getId();
        }
        if (post.getTitle() != null) {
            title = post.getTitle();
        }
        if (post.getBody() != null) {
            body = post.getBody();
        }
        PostResponseDto postResponseDto = new PostResponseDto(id, title, body);
        return postResponseDto;
    }
}
