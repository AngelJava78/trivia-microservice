package com.nttdata.services.trivia.repository;

import com.nttdata.services.trivia.dto.QuestionDto;
import com.nttdata.services.trivia.model.Question;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {


}

