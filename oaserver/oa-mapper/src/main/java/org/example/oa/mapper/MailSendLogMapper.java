package org.example.oa.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.oa.model.MailSendLog;

import java.util.Date;
import java.util.List;

public interface MailSendLogMapper {
    Integer updateMailSendLogStatus(@Param("msgId") String msgId, @Param("status") Integer status);

    Integer insert(MailSendLog mailSendLog);

    List<MailSendLog> getMailSendLogsByStatus();

    Integer updateCount(@Param("msgId") String msgId, @Param("date") Date date);
}