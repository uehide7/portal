package com.portal.z.user.domain.service;

import java.util.List;

import com.portal.z.common.domain.model.Role;
import com.portal.z.common.domain.model.User;
//JDBC用
import org.springframework.dao.DataAccessException;

/**
 * UserService
 *
 */
public interface UserService {

    /**
     * 全件取得用メソッド.
     * 
     * @return selectMany
     */
    public List<User> selectMany();

    /**
     * １件取得用メソッド.
     * 
     * @param user_id user
     * @return selectOne
     */
    public User selectOne(String user_id);

    /**
     * １件更新用メソッド.
     * 
     * @param user user
     * @return updateOne
     */
    public boolean updateOne(User user);

    /**
     * CSV出力用メソッド.
     * 
     * @throws DataAccessException DataAccessException
     */
    public void userCsvOut() throws DataAccessException;

    /**
     * 条件検索用メソッド.
     * 
     * @param user_id            user_id
     * @param user_due_date_from user_due_date_from
     * @param user_due_date_to   user_due_date_to
     * @return selectBy
     */
    public List<User> selectBy(String user_id, String user_due_date_from, String user_due_date_to);

    /**
     * ロールＩＤ取得用メソッド.<BR>
     * 環境マスタの環境ＩＤからロールＩＤを取得する ※ROLE_NAME_AとROLE_NAME_Gを想定
     * 
     * @param env_id env_id
     * @return selectRoleid
     */
    public Role selectRoleid(String env_id);
}
