package service;

import models.Message;

import java.util.List;

public interface FeedService {

    List<Message> getFeeds(String username);

}
