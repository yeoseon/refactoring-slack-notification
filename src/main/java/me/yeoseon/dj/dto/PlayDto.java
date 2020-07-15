package me.yeoseon.dj.dto;

import bankware.finlab.portal.entertainment.dj.domain.Request;
import bankware.finlab.portal.entertainment.dj.domain.Song;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PlayDto {
    private Song song;
    private ArrayList<Request> request;
}
