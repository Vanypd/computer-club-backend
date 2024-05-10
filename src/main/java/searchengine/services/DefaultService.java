package searchengine.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import searchengine.repository.RepositoryManager;

public abstract class DefaultService {
    protected static final Logger LOGGER = LoggerFactory.getLogger(DefaultService.class);
    protected final RepositoryManager repositoryManager;


    @Autowired
    public DefaultService(RepositoryManager repositoryManager) {
        this.repositoryManager = repositoryManager;
    }

}
