package com.example.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
@ComponentScan
@Component
public class DataService {
    @Autowired
    private Data data;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Data setupData() {
        String membersListSql = "SELECT \n" +
                "\tE.ID,\n" +
                "\tE.FIRSTNAME,\n" +
                "\tE.LASTNAME,\n" +
                "\tE.POSITION,\n" +
                "\tP.TITLE\n" +
                "FROM\n" +
                "\tEMPLOYEES E,\n" +
                "\tPROJECTS P\n" +
                "WHERE\n" +
                "\tE.PROJECT = P.ID";
        List<String> membersList = jdbcTemplate.query(membersListSql, new RowMapper(){

            @Override
            public String mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getString("FIRSTNAME") + " " +
                        rs.getString("LASTNAME") + " " +
                        rs.getString("POSITION") + " " +
                        rs.getString("TITLE");
            }
        });


        data = new Data.Builder()
                .withMemberList(membersList).build();
        return data;
    }


}
