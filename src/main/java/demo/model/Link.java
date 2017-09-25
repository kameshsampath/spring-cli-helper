package demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {

    private Map<String, String> reference;

    //Added reference if you need
    private List<Guide> guide;
}
