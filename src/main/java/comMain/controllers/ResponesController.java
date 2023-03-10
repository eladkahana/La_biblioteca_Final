package comMain.controllers;

import comMain.entities.ResponesEntity;
import comMain.services.ResponesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/respones")
public class ResponesController {

    @Autowired
    private ResponesService responesService;

    @PostMapping
    public String save(@Valid @RequestBody ResponesEntity vO) {
        return responesService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Integer id) {
        responesService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Integer id,
                       @Valid @RequestBody ResponesEntity vO) {
        responesService.update(id, vO);
    }

    @GetMapping("/{id}")
    public ResponesEntity getById(@Valid @NotNull @PathVariable("id") Integer id) {
        return responesService.getById(id);
    }


}
