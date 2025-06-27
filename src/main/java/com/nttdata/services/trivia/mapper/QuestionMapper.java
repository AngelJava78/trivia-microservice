package com.nttdata.services.trivia.mapper;

import com.nttdata.services.trivia.dto.QuestionDto;
import com.nttdata.services.trivia.model.Question;
import java.util.List;
import org.mapstruct.Mapper;

/**
 * Question mapper interface.
 *
 * @author <a href="ajavierv@emeal.nttdata.com">ajavierv@emeal.nttdata.com</a>
 */
@Mapper(componentModel = "spring")
public interface QuestionMapper {

  /**
   * convert from question model to question dto.
   *
   * @param question a question model.
   * @return a question dto.
   */
  QuestionDto toDto(Question question);

  /**
   * convert from question dto to question model.
   *
   * @param questionDto a question dto.
   * @return a question model.
   */
  Question toModel(QuestionDto questionDto);

  List<QuestionDto> toDtoList(List<Question> questionList);

  List<Question> toModelList(List<QuestionDto> questionDtoList);
}
