package com.family168.security.domain;

import java.io.Serializable;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;


/**
 * User generated by Lingo.
 *
 * @author Lingo
 * @since 2007年08月18日 下午 20时18分45秒0
 */
@Entity
@Table(name = "USER")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User implements Serializable {
    // ----------------------------------------------------
    // static fields
    // ----------------------------------------------------
    /** * serial. */
    static final long serialVersionUID = 0L;

    /** * 可用状态. */
    public static final Integer STATUS_ENABLED = Integer.valueOf(1);

    /** * 不可用状态. */
    public static final Integer STATUS_DISABLED = Integer.valueOf(0);

    /** * 状态枚举. */
    public static final Map<Integer, String> STATUS_ENUM = new LinkedHashMap<Integer, String>();

    static {
        STATUS_ENUM.put(STATUS_ENABLED, "有效");
        STATUS_ENUM.put(STATUS_DISABLED, "无效");
    }

    /** * id. */
    private Long id;

    /** * dept. */
    private Dept dept;

    /** * username. */
    private String username;

    /** * password. */
    private String password;

    /** * status. */
    private Integer status;

    /** * descn. */
    private String descn;

    /** * roles. */
    private Set<Role> roles = new HashSet<Role>(0);

    /** * 构造方法. */
    public User() {
    }

    /** * @return id. */
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    /** * @param id id. */
    public void setId(Long id) {
        this.id = id;
    }

    /** * @return dept. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPT_ID")
    public Dept getDept() {
        return dept;
    }

    /** * @param dept dept. */
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    /** * @return username. */
    @Column(name = "USERNAME", length = 50)
    public String getUsername() {
        return username;
    }

    /** * @param username username. */
    public void setUsername(String username) {
        this.username = username;
    }

    /** * @return password. */
    @Column(name = "PASSWORD", length = 50)
    public String getPassword() {
        return password;
    }

    /** * @param password password. */
    public void setPassword(String password) {
        this.password = password;
    }

    /** * @return status. */
    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    /** * @param status status. */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** * @return descn. */
    @Column(name = "DESCN", length = 200)
    public String getDescn() {
        return descn;
    }

    /** * @param descn descn. */
    public void setDescn(String descn) {
        this.descn = descn;
    }

    /** * @return roles. */
    @ManyToMany(cascade =  {
        CascadeType.PERSIST, CascadeType.MERGE}
    , fetch = FetchType.LAZY)
    @JoinTable(name = "USER_ROLE", joinColumns =  {
        @JoinColumn(name = "USER_ID")
    }
    , inverseJoinColumns =  {
        @JoinColumn(name = "ROLE_ID")
    }
    )
    public Set<Role> getRoles() {
        return roles;
    }

    /** * @param roles roles. */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    // ----------------------------------------------------
    // transient methods
    // ----------------------------------------------------
    /** * @return 当前用户是否可用. */
    @Transient
    public boolean isEnabled() {
        return ((status != null) && !status.equals(STATUS_DISABLED));
    }

    /** * @param enabled boolean. */
    public void setEnabled(boolean enabled) {
        if (enabled) {
            status = STATUS_ENABLED;
        } else {
            status = STATUS_DISABLED;
        }
    }
}