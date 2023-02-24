package server.rba1aji.academicmanagementsystem.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import server.rba1aji.academicmanagementsystem.models.ExamBatch;

import java.sql.PreparedStatement;
import java.util.List;

import static server.rba1aji.academicmanagementsystem.sqlqueries.ExamBatchSQL.SQL_EXAMBATCH_CREATE;
import static server.rba1aji.academicmanagementsystem.sqlqueries.ExamBatchSQL.SQL_EXAMBATCH_FIND_BY_BRANCHID_EXAMID;

@Repository
@Transactional
public class ExamBatchRepo implements IExamBatchRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void create(ExamBatch batch) {
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(SQL_EXAMBATCH_CREATE);
            ps.setString(1, batch.getName());
            ps.setString(2, batch.getStartStudentid());
            ps.setString(3, batch.getEndStudentid());
            ps.setTimestamp(4, batch.getStarttime());
            ps.setTimestamp(5, batch.getEndtime());
            ps.setString(6, batch.getFacultyid());
            ps.setString(7,batch.getVenue());
            ps.setString(8, batch.getCourseid());
            ps.setInt(9, batch.getExamid());
            ps.setString(10, batch.getBranchid());
            return ps;
        });
    }

    @Override
    public List<ExamBatch> findByBranchidExamid(String branchid, String examid) {
        return jdbcTemplate.query(SQL_EXAMBATCH_FIND_BY_BRANCHID_EXAMID, new Object[]{branchid, examid}, examBatchRowMapper);
    }

    private final RowMapper<ExamBatch> examBatchRowMapper = ((rs, rowNo) -> (
            new ExamBatch(
                    rs.getInt("ID"),
                    rs.getString("NAME"),
                    rs.getString("START_STUDENT_ID"),
                    rs.getString("END_STUDENT_ID"),
                    rs.getTimestamp("STARTTIME"),
                    rs.getTimestamp("ENDTIME"),
                    rs.getString("FACULTYID"),
                    rs.getString("VENUE"),
                    rs.getString("COURSEID"),
                    rs.getInt("EXAMID"),
                    rs.getString("BRANCHID")
            )
    ));
}