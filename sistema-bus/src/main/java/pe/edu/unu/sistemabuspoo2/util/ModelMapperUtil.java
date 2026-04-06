package pe.edu.unu.sistemabuspoo2.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperUtil {

    private static ModelMapper mapper;

    public ModelMapperUtil(ModelMapper mapper) {
        ModelMapperUtil.mapper = mapper;
    }

    // Método genérico (EL MÁS IMPORTANTE)
    public static <T> T convertTo(Object origin, Class<T> targetClass){
        return mapper.map(origin, targetClass);
    }

}