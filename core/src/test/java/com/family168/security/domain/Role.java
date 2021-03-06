package com.family168.security.domain;

import java.io.Serializable;

import java.util.HashSet;
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
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;


/**
 * Role generated by Lingo.
 *
 * @author Lingo
 * @since 2007年08月18日 下午 20时18分45秒0
 */
@Entity
@Table(name = "ROLE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Role implements Serializable {
    /** * serial. */
    static final long serialVersionUID = 0L;

    /** * id. */
    private Long id = null;

    /** * name. */
    private String name;

    /** * descn. */
    private String descn;

    /** * users. */
    private Set<User> users = new HashSet<User>(0);

    /** * rescs. */
    private Set<Resc> rescs = new HashSet<Resc>(0);

    /** * menus. */
    private Set<Menu> menus = new HashSet<Menu>(0);

    // ----------------------------------------------------
    // transient fields
    // ----------------------------------------------------
    /** * 是否授权. */
    private Boolean authorized;

    /** * 构造方法. */
    public Role() {
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

    /** * @return name. */
    @Column(name = "NAME", length = 50, unique = true, nullable = false)
    public String getName() {
        return name;
    }

    /** * @param name name. */
    public void setName(String name) {
        this.name = name;
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

    /** * @return users. */
    @ManyToMany(cascade =  {
        CascadeType.PERSIST, CascadeType.MERGE}
    , fetch = FetchType.LAZY)
    @JoinTable(name = "USER_ROLE", joinColumns =  {
        @JoinColumn(name = "ROLE_ID")
    }
    , inverseJoinColumns =  {
        @JoinColumn(name = "USER_ID")
    }
    )
    public Set<User> getUsers() {
        return users;
    }

    /** * @param users users. */
    public void setUsers(Set<User> users) {
        this.users = users;
    }

    /** * @return rescs. */
    @ManyToMany(cascade =  {
        CascadeType.PERSIST, CascadeType.MERGE}
    , fetch = FetchType.LAZY)
    @JoinTable(name = "RESC_ROLE", joinColumns =  {
        @JoinColumn(name = "ROLE_ID")
    }
    , inverseJoinColumns =  {
        @JoinColumn(name = "RESC_ID")
    }
    )
    public Set<Resc> getRescs() {
        return rescs;
    }

    /** * @param rescs rescs. */
    public void setRescs(Set<Resc> rescs) {
        this.rescs = rescs;
    }

    /** * @return menus. */
    @ManyToMany(cascade =  {
        CascadeType.PERSIST, CascadeType.MERGE}
    , fetch = FetchType.LAZY)
    @JoinTable(name = "MENU_ROLE", joinColumns =  {
        @JoinColumn(name = "ROLE_ID")
    }
    , inverseJoinColumns =  {
        @JoinColumn(name = "MENU_ID")
    }
    )
    public Set<Menu> getMenus() {
        return menus;
    }

    /** * @param menus menus. */
    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    // ----------------------------------------------------
    // transient methods
    // ----------------------------------------------------
    /** * @return is authorized. */
    @Transient
    public Boolean getAuthorized() {
        return authorized;
    }

    /** * @param authorized is authorized. */
    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    /**
     * 判断相同.
     *
     * @param o Object
     * @return boolean
     */
    public boolean equals(Object o) {
        if (!(o instanceof Role)) {
            return false;
        } else {
            Role role = (Role) o;

            return role.id.equals(this.id);
        }
    }

    /** * @return hashCode. */
    public int hashCode() {
        if (this.id == null) {
            return super.hashCode();
        } else {
            return this.id.hashCode();
        }
    }
}
