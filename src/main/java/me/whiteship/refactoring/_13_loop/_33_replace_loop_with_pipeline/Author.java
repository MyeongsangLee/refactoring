package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        var result = new ArrayList<String> ();
        for (Author a : authors) {
            if (a.company.equals(company)) {
                var handle = a.twitterHandle;
                if (handle != null)
                    result.add(handle);
            }
        }
        return result;
    }

    static public List<String> TwitterHandlesRefactor(List<Author> authors, String company) {
        List<String> collect = authors.stream()
                .filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
                .filter(a -> a != null)
                .collect(Collectors.toList());

        return collect;
    }


}
