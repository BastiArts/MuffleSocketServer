package com.bastiarts.muffle.entity;

import java.util.Date;

/**
 * MuffleSocketServer
 *
 * @author: Sebastian Schiefermayr
 * Date: 27.02.2020
 * Time: 13:59
 * =====================================
 * Website: https://bastiarts.com
 * Email: basti@bastiarts.com
 * Github: https://github.com/BastiArts
 * =====================================
 */

/**
 * Used for Session and personal Queues
 */
public class QueuedSong {
    private Song song;
    private Date addDate;
    private Muffler muffler;
}
