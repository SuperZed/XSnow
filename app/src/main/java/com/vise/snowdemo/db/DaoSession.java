package com.vise.snowdemo.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.vise.snowdemo.mode.GithubModel;

import com.vise.snowdemo.db.GithubModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig githubModelDaoConfig;

    private final GithubModelDao githubModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        githubModelDaoConfig = daoConfigMap.get(GithubModelDao.class).clone();
        githubModelDaoConfig.initIdentityScope(type);

        githubModelDao = new GithubModelDao(githubModelDaoConfig, this);

        registerDao(GithubModel.class, githubModelDao);
    }
    
    public void clear() {
        githubModelDaoConfig.clearIdentityScope();
    }

    public GithubModelDao getGithubModelDao() {
        return githubModelDao;
    }

}
