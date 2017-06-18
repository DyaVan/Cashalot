package com.cashalot.validation.validators;

import com.cashalot.validation.annotations.ValidMediaFile;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;


public class CustomMediaFileValidator implements ConstraintValidator<ValidMediaFile,MultipartFile> {

    private final String[] mediaFileTypes = new String[]{"wmv","mp4","flv","mkv","webm",
    "jpeg","jpg","png","bmp"};

    @Override
    public void initialize(ValidMediaFile validMediaFile) {

    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {

        return FilenameUtils.isExtension(multipartFile.getOriginalFilename(),mediaFileTypes);
    }
}
