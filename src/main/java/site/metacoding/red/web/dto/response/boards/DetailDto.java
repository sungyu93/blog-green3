package site.metacoding.red.web.dto.response.boards;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.domain.boards.Boards;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DetailDto {
	private Integer id;
	private String title;
	private String content;
	private Integer usersId;
	private Timestamp createdAt;
	private Integer loveCount;
	private Boolean isLoved;
	private Integer lovesId;
}
