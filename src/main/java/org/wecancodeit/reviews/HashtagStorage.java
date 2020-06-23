package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;

@Service
public class HashtagStorage {

    private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    public Hashtag findHashtagById(Long id){
        return hashtagRepo.findHashtagById(id);
    }



}
