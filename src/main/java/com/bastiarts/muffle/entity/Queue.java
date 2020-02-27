package com.bastiarts.muffle.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * MuffleSocketServer
 *
 * @author: Sebastian Schiefermayr
 * Date: 14.02.2020
 * Time: 11:31
 * =====================================
 * Website: https://bastiarts.com
 * Email: basti@bastiarts.com
 * Github: https://github.com/BastiArts
 * =====================================
 */
public class Queue {
    private long id = 0L;
    private List<QueuedSong> songs = new LinkedList<>();

}
