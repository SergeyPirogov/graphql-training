package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface QueryResolver {

    Capsule capsule(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Capsule> capsules(CapsulesFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    java.util.List<Capsule> capsulesPast(CapsulesFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    java.util.List<Capsule> capsulesUpcoming(CapsulesFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    Info company() throws Exception;

    Core core(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Core> cores(CoresFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    java.util.List<Core> coresPast(CoresFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    java.util.List<Core> coresUpcoming(CoresFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    Dragon dragon(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Dragon> dragons(Integer limit, Integer offset) throws Exception;

    java.util.List<History> histories(HistoryFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    HistoriesResult historiesResult(HistoryFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    History history(@javax.validation.constraints.NotNull String id) throws Exception;

    Landpad landpad(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Landpad> landpads(Integer limit, Integer offset) throws Exception;

    Launch launch(@javax.validation.constraints.NotNull String id) throws Exception;

    Launch launchLatest(Integer offset) throws Exception;

    Launch launchNext(Integer offset) throws Exception;

    java.util.List<Launch> launches(LaunchFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    java.util.List<Launch> launchesPast(LaunchFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    LaunchesPastResult launchesPastResult(LaunchFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    java.util.List<Launch> launchesUpcoming(LaunchFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    Launchpad launchpad(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Launchpad> launchpads(Integer limit, Integer offset) throws Exception;

    Mission mission(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Mission> missions(MissionsFind find, Integer limit, Integer offset) throws Exception;

    MissionResult missionsResult(MissionsFind find, Integer limit, Integer offset) throws Exception;

    Payload payload(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Payload> payloads(PayloadsFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    Roadster roadster() throws Exception;

    Rocket rocket(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Rocket> rockets(Integer limit, Integer offset) throws Exception;

    RocketsResult rocketsResult(Integer limit, Integer offset) throws Exception;

    Ship ship(@javax.validation.constraints.NotNull String id) throws Exception;

    java.util.List<Ship> ships(ShipsFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    ShipsResult shipsResult(ShipsFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

    /**
     * fetch data from the table: "users"
     */
    @javax.validation.constraints.NotNull
    java.util.List<Users> users(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

    /**
     * fetch aggregated fields from the table: "users"
     */
    @javax.validation.constraints.NotNull
    Users_aggregate users_aggregate(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

    /**
     * fetch data from the table: "users" using primary key columns
     */
    Users users_by_pk(@javax.validation.constraints.NotNull String id) throws Exception;

}
