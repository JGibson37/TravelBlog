package org.wecancodeit.reviews;
import org.springframework.stereotype.Service;
@Service
public class HashtagStorage {
    private HashtagRepository hashtagRepo;
    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }
    public Iterable<Hashtag> getHashtags() {
        return hashtagRepo.findAll();
    }
    public Hashtag findHashtagByHashtag(String hashtag) {
        return hashtagRepo.findHashtagByHashtag(hashtag);
    }
    public void save(Hashtag hashtag) {
        hashtagRepo.save(hashtag);
    }
    public Hashtag findHashtagById(Long id){
        return hashtagRepo.findHashtagById(id);
    }
}
