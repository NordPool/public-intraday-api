package com.nordpool.id.publicapi.v1.command;

/**
 * Created by Askar.Ibragimov on 2017-05-26.
 */
public class TokenRefreshCommand extends Command {
    // Prospective fields for token replacement
    private String oldToken;
    private String newToken;

    public TokenRefreshCommand() {
        super(CommandType.TOKEN_REFRESH);
    }

    private TokenRefreshCommand(Builder builder) {
        this();
        oldToken = builder.oldToken;
        newToken = builder.newToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(TokenRefreshCommand copy) {
        Builder builder = new Builder();
        builder.oldToken = copy.oldToken;
        builder.newToken = copy.newToken;
        return builder;
    }

    public String getOldToken() {
        return oldToken;
    }

    public void setOldToken(String oldToken) {
        this.oldToken = oldToken;
    }

    public String getNewToken() {
        return newToken;
    }

    public void setNewToken(String newToken) {
        this.newToken = newToken;
    }


    @Override
    public String toString() {
        return "TokenRefreshCommand{" +
                ", oldToken='" + oldToken + '\'' +
                ", newToken='" + newToken + '\'' +
                "} " + super.toString();
    }

    /**
     * {@code TokenRefreshCommand} builder static inner class.
     */
    public static final class Builder {
        private String oldToken;
        private String newToken;

        private Builder() {
        }

        /**
         * Sets the {@code oldToken} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code oldToken} to set
         * @return a reference to this Builder
         */
        public Builder withOldToken(String val) {
            oldToken = val;
            return this;
        }

        /**
         * Sets the {@code newToken} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code newToken} to set
         * @return a reference to this Builder
         */
        public Builder withNewToken(String val) {
            newToken = val;
            return this;
        }

        /**
         * Returns a {@code TokenRefreshCommand} built from the parameters previously set.
         *
         * @return a {@code TokenRefreshCommand} built with parameters of this {@code TokenRefreshCommand.Builder}
         */
        public TokenRefreshCommand build() {
            return new TokenRefreshCommand(this);
        }
    }
}
