package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAsyncCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<AsyncDeviceListCommand> commands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private QueueCommandPage page;

    public ListAsyncCommandsResponse withCommands(List<AsyncDeviceListCommand> commands) {
        this.commands = commands;
        return this;
    }

    public ListAsyncCommandsResponse addCommandsItem(AsyncDeviceListCommand commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public ListAsyncCommandsResponse withCommands(Consumer<List<AsyncDeviceListCommand>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * 设备队列命令列表。
     * @return commands
     */
    public List<AsyncDeviceListCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<AsyncDeviceListCommand> commands) {
        this.commands = commands;
    }

    public ListAsyncCommandsResponse withPage(QueueCommandPage page) {
        this.page = page;
        return this;
    }

    public ListAsyncCommandsResponse withPage(Consumer<QueueCommandPage> pageSetter) {
        if (this.page == null) {
            this.page = new QueueCommandPage();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public QueueCommandPage getPage() {
        return page;
    }

    public void setPage(QueueCommandPage page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAsyncCommandsResponse that = (ListAsyncCommandsResponse) obj;
        return Objects.equals(this.commands, that.commands) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAsyncCommandsResponse {\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}