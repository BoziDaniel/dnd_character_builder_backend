package dnd_backend.dnd_backend;

import dnd_backend.dnd_backend.service.dao.ItemDao;
import dnd_backend.dnd_backend.service.data_handling.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
public class DndBackendApplication {

    @Autowired
    private APIService apiService;

    @Autowired
    @Qualifier("itemService")
    private ItemDao itemDao;


    public static void main(String[] args) {
        SpringApplication.run(DndBackendApplication.class, args);
    }

    @PostConstruct
    public void afterInit() throws IOException {
        apiService.getAllItems();
        System.out.println(itemDao.getAllItems());
    }
}
