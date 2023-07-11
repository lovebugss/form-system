package com.example.form.service.form.parser;

import com.example.form.pojo.dto.CreateFormDTO;
import org.springframework.stereotype.Service;

/**
 * <a href="https://xrender.fun/schema-builder-online">xrender</a>
 * @author r9796
 */
@Service
public class XRenderSchemeParser implements FormDesignerSchemeParser {
    @Override
    public CreateFormDTO parse(String scheme) {
        return null;
    }

    @Override
    public FormSchemeType schemeType() {
        return FormSchemeType.XRENDER;
    }
}

