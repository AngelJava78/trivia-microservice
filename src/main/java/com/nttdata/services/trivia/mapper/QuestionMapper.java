package com.nttdata.services.trivia.mapper;

import com.nttdata.services.trivia.dto.QuestionDto;
import com.nttdata.services.trivia.model.Question;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
  QuestionDto toDto(Question question);

  Question toModel(QuestionDto questionDto);

  List<QuestionDto> toDtoList(List<Question> questionList);

  List<Question> toModelList(List<QuestionDto> questionDtoList);
}
