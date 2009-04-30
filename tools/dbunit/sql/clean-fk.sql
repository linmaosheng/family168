alter table ACL_ENTRY drop constraint FK_ACL_ENTRY_ACL_OBJECT_IDENTITY;
alter table ACL_ENTRY drop constraint FK_ACL_ENTRY_SID;
alter table ACL_OBJECT_IDENTITY drop constraint FK_OBJECT_IDENTITY_OBJECT_ID;
alter table ACL_OBJECT_IDENTITY drop constraint FK_OBJECT_IDENTITY_OWNER_SID;
alter table ACL_OBJECT_IDENTITY drop constraint FK_OBJECT_IDENTITY_PARENT_OBJECT;
alter table DEPT drop constraint FK_DEPT_PARENT;
alter table JBPM_ACTIVITY drop constraint FK_ACTS_PROCESS;
alter table JBPM_ACTIVITY drop constraint FK_ACT_DEFTRANS;
alter table JBPM_ACTIVITY drop constraint FK_ACT_PARENT;
alter table JBPM_ACTIVITY drop constraint FK_ACT_PROCESS;
alter table JBPM_ACTIVITY drop constraint FK_ACT_PROPS;
alter table JBPM_ACTIVITY drop constraint FK_NODE_BEHAV_DESCR;
alter table JBPM_ARGDESCRIPTOR drop constraint FK_ARGDESCR_DESCR;
alter table JBPM_ARGDESCRIPTOR drop constraint FK_ARGDSCR_OPER;
alter table JBPM_ARGDESCRIPTOR drop constraint FK_OBJARG_DESCR;
alter table JBPM_COMMENT drop constraint FK7BD9C13586A745AD;
alter table JBPM_DESCRIPTOR drop constraint FK_DESCR_ARG_REF;
alter table JBPM_DESCRIPTOR drop constraint FK_DESCR_KEYDESCR;
alter table JBPM_DESCRIPTOR drop constraint FK_DESCR_PROPS;
alter table JBPM_DESCRIPTOR drop constraint FK_DESCR_VALDESCR;
alter table JBPM_EVENT drop constraint FK_EVENT_ACT;
alter table JBPM_EVENT drop constraint FK_EVENT_PROCDEF;
alter table JBPM_EVENT drop constraint FK_EVENT_PROCESS;
alter table JBPM_EVENT drop constraint FK_EVENT_PROPS;
alter table JBPM_EVENT drop constraint FK_EVENT_TRANS;
alter table JBPM_EXCEPTHNDLR drop constraint FK_EXHDLR_ACT;
alter table JBPM_EXCEPTHNDLR drop constraint FK_EXHDLR_EVENT;
alter table JBPM_EXCEPTHNDLR drop constraint FK_EXHDLR_PROCESS;
alter table JBPM_EXCEPTHNDLR drop constraint FK_EXHDLR_TRANS;
alter table JBPM_EXECUTION drop constraint FK4837C6E47026E1F;
alter table JBPM_EXECUTION drop constraint FK_EXEC_ACT;
alter table JBPM_EXECUTION drop constraint FK_EXEC_INSTANCE;
alter table JBPM_EXECUTION drop constraint FK_EXEC_PARENT;
alter table JBPM_EXECUTION drop constraint FK_EXEC_PROCESS;
alter table JBPM_EXECUTION drop constraint FK_EXEC_SUPEREXEC;
alter table JBPM_EXECUTION drop constraint FK_EXEC_TRANSORIG;
alter table JBPM_HIST_ACTINST drop constraint FK_HAI_HPI;
alter table JBPM_HIST_ACTINST drop constraint FK_HISTAI_ACT;
alter table JBPM_HIST_PROCINST drop constraint FK_HISTPI_PROCDEF;
alter table JBPM_JOB drop constraint FK_JOB_CMDDESCR;
alter table JBPM_JOB drop constraint FK_JOB_NODE;
alter table JBPM_JOB drop constraint FK_JOB_PRINST;
alter table JBPM_JOB drop constraint FK_TMR_EXECUTION;
alter table JBPM_JPDL_ACTIVITY drop constraint FK_ACT_EXCLDESCR;
alter table JBPM_JPDL_ACTIVITY drop constraint FK_ACT_INVKOPER;
alter table JBPM_JPDL_ACTIVITY drop constraint FK_ACT_JAVADESCR;
alter table JBPM_JPDL_ACTIVITY drop constraint FK_ACT_PARAMDESCR;
alter table JBPM_JPDL_ACTIVITY drop constraint FK_ACT_PARTSDESCR;
alter table JBPM_JPDL_EXECUTION drop constraint FKA5B37C91F3DBDB5E;
alter table JBPM_JPDL_PROCDEF drop constraint FK4D2898A820C24C68;
alter table JBPM_LOB drop constraint FK_LOB_PROCESS;
alter table JBPM_OBJECTREF drop constraint FK_OBJECTREF_EVENT;
alter table JBPM_OBJECTREF drop constraint FK_OBJREF_EVENT;
alter table JBPM_OBJECTREF drop constraint FK_OBJREF_EXHNDLR;
alter table JBPM_OPERATION drop constraint FK_OBJOPER_DESCR;
alter table JBPM_OPERATION drop constraint FK_OPER_DESC;
alter table JBPM_PROCESS drop constraint FK_PROCDEF_INITIAL;
alter table JBPM_PROCESS drop constraint FK_PROCDEF_PROPS;
alter table JBPM_TIMERDEF drop constraint FK_TMRDEF_ACT;
alter table JBPM_TIMERDEF drop constraint FK_TMRDEF_PROCESS;
alter table JBPM_TRANSITION drop constraint FK4FF269FD5B03CD3;
alter table JBPM_TRANSITION drop constraint FK4FF269FFC35DF40;
alter table JBPM_TRANSITION drop constraint FK_TRANS_COND;
alter table JBPM_TRANSITION drop constraint FK_TRANS_DST;
alter table JBPM_TRANSITION drop constraint FK_TRANS_PROCDEF;
alter table JBPM_TRANSITION drop constraint FK_TRANS_PROPS;
alter table JBPM_TRANSITION drop constraint FK_TRANS_SRC;
alter table JBPM_VARIABLE drop constraint FK_VAR_EXECUTION;
alter table JBPM_VARIABLE drop constraint FK_VAR_LOB;
alter table JBPM_VARIABLE drop constraint FK_VAR_PROCINST;
alter table JBPM_VARIABLEDEF drop constraint FK_VARDEF_ACT;
alter table JBPM_VARIABLEDEF drop constraint FK_VARDEF_INDES;
alter table JBPM_VARIABLEDEF drop constraint FK_VARDEF_PROCESS;
alter table MENU drop constraint FK_MENU_PARENT;
alter table MENU_ROLE drop constraint FK_MENU_ROLE_MENU;
alter table MENU_ROLE drop constraint FK_MENU_ROLE_ROLE;
alter table PARTICIPANTIMPL drop constraint FK_PART_SWIMLANE;
alter table PARTICIPANTIMPL drop constraint FK_PART_TASK;
alter table RESC_ROLE drop constraint FK_RESC_ROLE_RESC;
alter table RESC_ROLE drop constraint FK_RESC_ROLE_ROLE;
alter table SWIMLANEIMPL drop constraint FK_SWIMLANE_DEF;
alter table TASKDEFINITIONIMPL drop constraint FK7E595B18496CBE65;
alter table TASKDEFINITIONIMPL drop constraint FK_TSK_ASIG_DESCR;
alter table TASKDEFINITIONIMPL drop constraint FK_TSK_SWIML_DEF;
alter table TASKIMPL drop constraint FK_TASK_EXEC;
alter table TASKIMPL drop constraint FK_TASK_SUPERTASK;
alter table TASKIMPL drop constraint FK_TASK_SWIML;
alter table USER drop constraint FK_USER_DEPT;
alter table USER_ROLE drop constraint FK_USER_ROLE_ROLE;
alter table USER_ROLE drop constraint FK_USER_ROLE_USER;
