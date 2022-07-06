package com.es.reportverse.service;

import com.es.reportverse.DTO.PublicationDTO;
import com.es.reportverse.model.Publication;
import javax.servlet.http.HttpServletRequest;

public interface PublicationService {

    Publication rergisterPublication(PublicationDTO publicationDTO, HttpServletRequest request);

    void savePublication(Publication publication);

    Publication getPublication(Long id);
}
