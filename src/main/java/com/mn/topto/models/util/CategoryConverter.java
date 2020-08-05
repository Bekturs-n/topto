package com.mn.topto.models.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter<Enum1, String> {

    @Override
    public String convertToDatabaseColumn(Enum1 category) {
        if (category == null) {
            return null;
        }
        return category.getCode();
    }

    @Override
    public Enum1 convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(Enum1.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
