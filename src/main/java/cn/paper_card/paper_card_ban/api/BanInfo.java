package cn.paper_card.paper_card_ban.api;

import java.util.UUID;

public record BanInfo(
        int id, // 封禁ID
        UUID banedPlayerUuid, // 被封禁玩家
        String banedPlayerName,
        UUID relativePlayerUuid, // 相关玩家
        String relativePlayerName,
        UUID operatorUuid, // 操作员
        String operatorName,

        boolean enable, // 是否启用，由相关玩家或操作员控制

        long beginTime, // 封禁开始时间

        String reason, // 封禁原因

        long banTime // 封禁持续时间
) {
}
