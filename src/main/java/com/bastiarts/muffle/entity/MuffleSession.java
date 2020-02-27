package com.bastiarts.muffle.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * MuffleSocketServer
 *
 * @author: Sebastian Schiefermayr
 * Date: 27.02.2020
 * Time: 13:47
 * =====================================
 * Website: https://bastiarts.com
 * Email: basti@bastiarts.com
 * Github: https://github.com/BastiArts
 * =====================================
 */
public class MuffleSession {
    public boolean closed = false;
    /**
     * Invite code which Mufflers will enter to join the Session
     */
    private short inviteCode = 0;
    private Queue queue;
    private List<SessionUser> users = new ArrayList<>();
}
