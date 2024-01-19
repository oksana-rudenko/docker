package mate.academy.docker.mapper;

import mate.academy.docker.config.MapperConfig;
import mate.academy.docker.dto.CreatePostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.model.Post;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface PostMapper {
    Post toEntity(CreatePostRequestDto createPostRequestDto);

    PostResponseDto toDto(Post post);
}
