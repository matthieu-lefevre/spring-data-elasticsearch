package com.mlefevre.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.util.ArrayList;
import java.util.List;

@Document(indexName = "referential", type = "users")
public class UsersIndex {

    @Id
    @Field(type = FieldType.String, index = FieldIndex.analyzed)
    private String uid;

    @Field(type = FieldType.String, index = FieldIndex.analyzed)
    private String longName;

    @Field(type = FieldType.Nested, index = FieldIndex.analyzed)
    private List<TeamsIndex> teams = new ArrayList<TeamsIndex>();


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public List<TeamsIndex> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamsIndex> teams) {
        this.teams = teams;
    }

    public void addTeam(TeamsIndex team) {
        this.teams.add(team);
    }

}
