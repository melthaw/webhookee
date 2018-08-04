package io.picos.webhookee.management.rest.support.impl;

import io.picos.webhookee.management.rest.support.ManagementRestSupport;
import io.picos.webhookee.outgoing.slack.SlackMessage;
import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.outgoing.dingding.DingDingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.outgoing.teambition.TeamBitionMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessage;
import org.springframework.stereotype.Component;

/**
 * @auther dz
 */
@Component
public class ManagementRestSupportImpl implements ManagementRestSupport {


    @Override
    public void processMessage(String id, BitBucketMessage message) {

    }

    @Override
    public void processMessage(String id, GitHubMessage message) {

    }

    @Override
    public void processMessage(String id, GitLabMessage message) {

    }

    @Override
    public void processMessage(String id, DockerHubMessage message) {

    }

    @Override
    public void processMessage(String id, CodingMessage message) {

    }

    @Override
    public void processMessage(String id, SlackMessage message) {

    }

    @Override
    public void processMessage(String id, DingDingMessage message) {

    }

    @Override
    public void processMessage(String id, BearyChatMessage message) {

    }

    @Override
    public void processMessage(String id, WorkTileMessage message) {

    }

    @Override
    public void processMessage(String id, TeamBitionMessage message) {

    }
}
