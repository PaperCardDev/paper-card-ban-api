package cn.paper_card.paper_card_ban.api;

import java.util.UUID;

public record ReportInfo(
        int id,
        UUID senderUuid,
        String senderName,
        String reason,
        UUID targetUuid,
        String targetName,
        long createTime,
        ReportState state,

        UUID operator,
        String operatorName,
        String comment
) {
}
