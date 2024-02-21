package com.hangout.Service;

import com.hangout.DTO.PageRequestDTO;
import com.hangout.DTO.PageResultDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.util.function.Function;

public class MainServiceImpl {
    /* public PageResultDTO<HangOutDTO, HangOut> getList(PageRequestDTO requestDTO) {

        Pageable pageable = requestDTO.getPageable(Sort.by("gno").descending());

        BooleanBuilder booleanBuilder = getSearch(requestDTO);

        Page<HangOut> result = repository.findAll(booleanBuilder, pageable);

        Function<HangOut, HangOutDTO> fn = (entity -> entityToDto(entity));
        return new PageResultDTO<>(result, fn);
    } */
}
