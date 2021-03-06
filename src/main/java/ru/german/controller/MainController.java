package ru.german.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.generated.com.cloud.tables.pojos.ElementObject;
import ru.german.model.ElementPojo;
import ru.german.service.ShareService;

import java.io.IOException;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/manual")
public class MainController {

    @Autowired
    private ShareService service;

    @RequestMapping(value = "/get/actual/{entityId}", method = GET)
    public ResponseEntity<ElementObject> getActualElementObject(@PathVariable Long entityId) {
        return service.getActualElement(entityId);
    }

    //region
    //todo made when try write worked frontend
    @RequestMapping(value = "/get/{id}", method = GET)
    public ElementObject getElementObject(@PathVariable Long id) {
        return service.getById(id);
    }
    @RequestMapping(value = "/getAll", method = GET)
    public List<ElementObject> getActualElementObject() {
        return service.getAllElements();
    }
    //endregion

    @RequestMapping(value = "/get/actual/content/{entityId}", method = GET)
    public ResponseEntity<String> getActualContentByElementEntity(@PathVariable Long entityId) {
        return service.getActualContent(entityId);
    }

    @RequestMapping(value = "/get/element/tree/{entityId}", method = RequestMethod.GET)
    public ResponseEntity<List<ElementPojo>> getElementTree(@PathVariable Long entityId) {
        return service.getElementTree(entityId);
    }

    @RequestMapping(value = "/create/", method = RequestMethod.PUT)
    public ResponseEntity<ElementObject> createElementObject(@RequestBody ElementObject content) {
        return service.createElementObject(content);
    }

    @RequestMapping(value = "/create/actual/withContent/", method = RequestMethod.PUT)
    public ResponseEntity<ElementPojo> createElementObjectWithContent(@RequestBody ElementPojo content) {
        return service.createElementObjectWithContent(content);
    }

    @RequestMapping(value = "/update/actual/{entityId}", method = RequestMethod.PUT)
    public ResponseEntity<ElementObject> updateActualElementByEntity(@RequestBody ElementObject content, @PathVariable Long entityId) {
        return service.updateActualElement(content, entityId);
    }

    @Transactional
    @RequestMapping(value = "/update/actual/content/{entityId}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateContentToActualElementEntity(@RequestBody String content, @PathVariable Long entityId) {
        return service.updateActualContentByElementEntity(content, entityId);
    }

    @RequestMapping(value = "/get/connect/{entityId}", method = GET)
    public ResponseEntity<String> testConnectToBucket(@PathVariable Long entityId) throws IOException {
        return service.testConnect(entityId);
    }
}
