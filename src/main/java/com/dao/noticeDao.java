package com.dao;

import com.model.notice;

import java.util.List;

public interface noticeDao {

    void saveNotice(notice notice);

    boolean updateNotice(notice notice);

    boolean deleteNotice(int id);

    notice findNoticeById(int id);

    List<notice> findAll();
}
