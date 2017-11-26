package com.example.demoapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Component
public class Data {
    @Autowired
    private final List<String> memberList;
    private final String clientInfo;
    @Autowired
    private final List<String> opportunitiesList;

    public static class Builder {
        private List<String> nestedMemberList;
        private String nestedClientInfo;
        private List<String> nestedOpportunitiesList;

        public Builder withMemberList(List<String> memberList) {
            this.nestedMemberList = memberList;
            return this;
        }

        public Builder withClientInfo(String clientInfo) {
            this.nestedClientInfo = clientInfo;
            return this;
        }

        public Builder withOpportunitiesList(List<String> opportunitiesList) {
            this.nestedOpportunitiesList = opportunitiesList;
            return this;
        }

        public Data build() {
            return new Data(nestedMemberList, nestedClientInfo, nestedOpportunitiesList);
        }
    }
}
