package com.example.form.service.form.check;

import com.example.form.enums.FieldType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author r9796
 */
@Slf4j
@Service
public class SelectFieldChecker extends ChooseFieldChecker {
    @Override
    public FieldType supportType() {
        return FieldType.SELECT;
    }
}
